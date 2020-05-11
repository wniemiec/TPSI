package wizut.tpsi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLException;


@Controller
public class HomeController
{

    @Autowired
    private BlogRepository blogRepository;


    @RequestMapping("/")
    public String home(Model model) throws SQLException {

        model.addAttribute("blog", blogRepository.getAllPosts());

        return "home";
    }

    @PostMapping("/newpost")
    public String newPost(BlogPost post) throws SQLException {
        blogRepository.createPost(post);
        return "redirect:/";
    }

    @RequestMapping("/delete{id}")
    public String delPost(@PathVariable String id) throws SQLException {
        blogRepository.deletePost(id);
        return "redirect:/";
    }

}
