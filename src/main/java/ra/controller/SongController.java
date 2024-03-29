package ra.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import ra.model.dto.SongDtoForm;
import ra.model.service.SongService;

@Controller
    public class SongController {
        @Autowired
        private SongService songService;
        @GetMapping
        public String home(Model model){
            model.addAttribute("list",songService.findAll());
            return "home";
        }
        @GetMapping("/add")
        public ModelAndView add(){
            return new ModelAndView("add","song",new SongDtoForm());
        }
        @GetMapping("/edit/{id}")
        public ModelAndView edit(@PathVariable Long id){
            return new ModelAndView("edit","song",songService.findById(id));
        }
        @GetMapping ("/delete/{id}")
        public String delete(@PathVariable Long id){
            songService.delete(id);
            return "redirect:/";
        }
        @PostMapping("/addSong")
        public String doAdd (@ModelAttribute SongDtoForm songDto){
            songService.save(songDto);
            return "redirect:/";
        }
        @PostMapping("/update")
        public String doUpdate(@ModelAttribute SongDtoForm songDto){
            songService.save(songDto);
            return "redirect:/";
        }

}
