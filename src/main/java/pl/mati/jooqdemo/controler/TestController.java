package pl.mati.jooqdemo.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.mati.jooqdemo.model.tables.pojos.TestTable;
import pl.mati.jooqdemo.service.TestService;

import java.util.Collection;

@RestController
public class TestController {
    private final TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping
    public Collection<TestTable> getTests() {
        return testService.getTests();
    }

    @PostMapping
    public void addTest(TextDTO textDTO) {
        testService.addTest(textDTO.getText());
    }
}
