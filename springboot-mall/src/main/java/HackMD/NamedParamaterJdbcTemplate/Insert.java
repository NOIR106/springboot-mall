package HackMD.NamedParamaterJdbcTemplate;

import HackMD.outObject.Studnet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Insert {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @PostMapping("/insetTest")
    public String insert(@RequestBody Studnet studnet){

        String sql = "INSERT INTO Student(id ,name VALUE (:studentId, :studentName)";

        Map<String , Object> map =new HashMap<>();
        map.put("studentId",studnet.getId());
        map.put("studentName",studnet.getName());

        namedParameterJdbcTemplate.update(sql,map);

        return  "insert 執行";
    }

    @PostMapping("deleteTest")
    public String delete(@RequestBody Studnet studnet){
        String sql = " DELETE FROM Student WHERE id = :studentId ";

        Map<String , Object> map = new HashMap<>();
        map.put("studentId", studnet.getId());

        namedParameterJdbcTemplate.update(sql, map);

        return "delete 執行";
    }
}
