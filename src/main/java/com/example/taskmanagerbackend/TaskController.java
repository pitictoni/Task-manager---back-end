import com.example.taskmanagerbackend.TaskServices;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")

@RequestMapping("/task")
public class TaskController
{
    private TaskServices taskServices;

    public TaskController(TaskServices taskServices) {
        this.taskServices = taskServices;
    }

    public  void addMockTasks(){
        taskServices.add
    }

}
