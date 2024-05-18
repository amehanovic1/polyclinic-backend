package com.hoperise.staff.services;
import com.hoperise.staff.dtos.ServiceDTO;
import com.hoperise.staff.models.Department;
import com.hoperise.staff.models.MedicalService;
import com.hoperise.staff.repositories.DepartmentRepository;
import com.hoperise.staff.repositories.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceService implements IServiceService {


    @Autowired
    private final ServiceRepository serviceRepository;
    @Autowired
    private final DepartmentRepository departmentRepository;

    public ServiceService(ServiceRepository serviceRepository, DepartmentRepository departmentRepository) {
        this.serviceRepository = serviceRepository;
        this.departmentRepository=departmentRepository;
    }

    @Override
    public MedicalService createService(MedicalService service) {
        return null;
    }

    @Override
    public ServiceDTO getServiceById(long id) {
        Optional<MedicalService> serviceOptional = serviceRepository.findById(id);
        if (serviceOptional.isPresent()) {
            MedicalService service = serviceOptional.get();
            Department department = departmentRepository.findById((long)service.getDepartment().getId()).orElse(null);
            if (department != null) {
                return new ServiceDTO(service.getId(), service.getName(), service.getPrice(), department.getName());
            }
        }
        return null;
    }

    @Override
    public MedicalService updateService(MedicalService service) {
        return null;
    }


    @Override
    public void deleteService(long id) {
        serviceRepository.deleteById(id);
    }

    @Override
    public List<MedicalService> getServicesByDepartmentId(long departmentId) {
        return null;
    }


}
