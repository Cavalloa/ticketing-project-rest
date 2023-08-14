package site.acavallo.service;

import site.acavallo.dto.RoleDTO;

import java.util.List;

public interface RoleService {
    List<RoleDTO> listAllRoles();
    RoleDTO findById(Long id);
}
