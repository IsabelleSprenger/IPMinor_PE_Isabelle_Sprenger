package main.model.service;

import main.model.dto.SubtaskDTO;
import main.model.entity.Task;
import main.model.dto.TaskDTO;

import java.util.List;

public interface TaskService {
	public List<TaskDTO> getTasks();

	void addTask(TaskDTO taskDTO);

	Task getTask(Long id);

	void editTask(Long id, TaskDTO task);

	void addSubtask(SubtaskDTO subtask);
}
