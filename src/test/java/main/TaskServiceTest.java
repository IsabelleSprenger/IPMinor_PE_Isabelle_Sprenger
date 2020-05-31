package main;

import main.model.dto.TaskDTO;
import main.model.repo.SubtaskRepository;
import main.model.repo.TaskRepository;
import main.model.service.TaskService;
import main.model.service.TaskServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TaskServiceTest {
    private TaskRepository repository;
    private SubtaskRepository subRepository;
    private TaskService taskService = new TaskServiceImpl(repository, subRepository);
    @Test
    public void testGetTasks(){
        //setup
        TaskDTO taskDTO = new TaskDTO();
        taskDTO.setTitle("Shopping");
        taskDTO.setDescription("Buy clothes");
        taskDTO.setDueDate(LocalDateTime.of(2020, 05, 31, 23, 59));
        taskService.addTask(taskDTO);

        //method to be tested
        List<TaskDTO> tasks = taskService.getTasks();

        //checks
        assertNotNull(tasks);
        assertFalse(tasks.isEmpty());
        assertEquals(1, tasks.size());
        TaskDTO task = tasks.get(0);
        assertNotNull(task);
    }
}
