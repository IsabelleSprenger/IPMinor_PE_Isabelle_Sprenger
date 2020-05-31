package main.model.repo;

import main.model.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long>{
   /* Task findById(long id);
    List<Task> findByDueDate(LocalDateTime dueDate);*/
}
