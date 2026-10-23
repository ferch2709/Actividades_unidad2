package com.universidad.calificaciones.service;

import org.springframework.stereotype.Service;

import com.universidad.calificaciones.repository.AlumnoRepository;
import com.universidad.calificaciones.repository.CalificacionRepository;
import com.universidad.calificaciones.model.Calificacion;
import java.util.List;
import com.universidad.calificaciones.model.Alumno;
import com.universidad.calificaciones.exception.AlumnoNoEncontradoException;
import com.universidad.calificaciones.exception.AlumnoNoInscritoException;
import com.universidad.calificaciones.exception.SinCalificacionesException;
import java.util.ArrayList;
import com.universidad.calificaciones.dto.CalificacionResponse;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Service    
public class CalificacionesService {
    private final CalificacionRepository calificacionRepository;
    private final AlumnoRepository alumnoRepository;

    public Alumno buscarAlumnoPorId(Long id) {
        return alumnoRepository.findById(id).orElseThrow(() -> new AlumnoNoEncontradoException(id));
    }

    public boolean alumnoInscrito(Long id) {
        Alumno alumno = buscarAlumnoPorId(id);
        return alumno.isInscrito();
    }


    
    public CalificacionesService(AlumnoRepository alumnoRepository, CalificacionRepository calificacionRepository){
        this.alumnoRepository = alumnoRepository;
        this.calificacionRepository = calificacionRepository;
    }

    public List<CalificacionResponse> consultarCalificaciones(Long idAlumno) {
        Alumno alumno = buscarAlumnoPorId(idAlumno);

       if (!alumnoInscrito(idAlumno)) {
        throw new AlumnoNoInscritoException(idAlumno);
       }


       
       List<Calificacion> calificaciones = calificacionRepository.findByIdAlumno(idAlumno);
       if(calificaciones.isEmpty()) {
        throw new SinCalificacionesException(idAlumno);
       }
      

       /**
        Notas para saber que hace porque si no se me olvida xd
         
       el map es para recorrer uno por uno, la c es para cada califcacion de la lista, el .map convierte la c en el objeto CalificacionResponse y luego con el tolist lo vuelve lista
        **/
       return calificaciones.stream()
        .map(c -> new CalificacionResponse(c.getNombreMateria(), c.getCalificacion()))
        .toList();
    }

}
