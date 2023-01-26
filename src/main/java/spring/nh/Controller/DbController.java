package spring.nh.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import spring.nh.entity.Db_entity;
import spring.nh.service.DbService;

@Controller
public class DbController {

    @Autowired
    private DbService dbService;

    @GetMapping("Db")
    public String DbWriteForm(){

        return "Db";
    }

    @PostMapping("Db/WritePro")
    public String db_WritePro(Db_entity db_entity){

        dbService.enrollment(db_entity);

        return "";

    }

    @GetMapping("/Db/list")
    public String DbList(){

        return "Boardlist";
    }
}
