package site.acavallo.service;

import site.acavallo.dto.ProjectDTO;
import site.acavallo.dto.UserDTO;
import java.util.List;

public interface ProjectService {
    ProjectDTO getByProjectCode(String code);
    List<ProjectDTO> listAllProjects();
    void save(ProjectDTO dto);
    void update (ProjectDTO dto);
    void delete (ProjectDTO dto);
    void complete (String code);
    List<ProjectDTO> listAllProjectDetails();
    List<ProjectDTO> listAllNonCompleteByAssignedManager(UserDTO assignedManager);
}
