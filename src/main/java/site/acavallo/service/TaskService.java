package site.acavallo.service;

import site.acavallo.dto.ProjectDTO;
import site.acavallo.dto.TaskDTO;
import site.acavallo.dto.UserDTO;
import site.acavallo.enums.Status;
import java.util.List;

public interface TaskService {
    TaskDTO findById(Long id);
    List<TaskDTO> listAllTasks();

    void save(TaskDTO dto);
    void update(TaskDTO dto);
    void delete(Long id);

    int totalNonCompleteTask(String projectCode);
    int totalCompleteTask(String projectCode);

    void deleteByProject(ProjectDTO projectDTO);

    void completeByProject(ProjectDTO projectDTO);

    List<TaskDTO> listAllTasksByStatusIsNot(Status status);
    List<TaskDTO> listAllTasksByStatus(Status status);

    List<TaskDTO> listAllNonCompleteByAssignedEmployee(UserDTO assignedEmployee);
}
