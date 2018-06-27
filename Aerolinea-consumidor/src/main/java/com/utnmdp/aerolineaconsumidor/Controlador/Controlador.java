package com.utnmdp.aerolineaconsumidor.Controlador;

import com.utnmdp.aerolinea.entidades.Aeropuerto;
import com.utnmdp.aerolinea.entidades.PrecioxRutaxCabina;
import com.utnmdp.aerolinea.entidades.Ruta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class Controlador {

    @Autowired
    protected RestTemplate restTemplate;


    /// EndPoint para poder ver todos los aeropuertos
    @GetMapping("/Aeropuertos")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody public  List<Aeropuerto> dametodos() {
        Aeropuerto[] aeropuertos =  restTemplate.getForObject("http://localhost:8080/Aeropuerto",Aeropuerto[].class);
        List<Aeropuerto> list = new ArrayList<Aeropuerto>(Arrays.asList(aeropuertos));
        return list;

    }

    //EndPoint para ver un aeropuerto por su ID
    @GetMapping("/Aeropuertos/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public  Aeropuerto Aeropuerto(@PathVariable long id) {
        Aeropuerto aeropuerto =  restTemplate.getForObject("http://localhost:8080/Aeropuerto/{id}",Aeropuerto.class, id);
        return aeropuerto;
    }

    //Endpoint para ver las rutas con el Id del aeropuerto de Salida
    @GetMapping("/Aeropuertos/{id}/Rutas")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<Ruta> rutaPorAeropuerto(@PathVariable long id) {
        Ruta[] rutas =  restTemplate.getForObject("http://localhost:8080/Aeropuerto/{id}/Rutas",Ruta[].class, id);
        List<Ruta> list = new ArrayList<>(Arrays.asList(rutas));
        return list;
    }

    //EndPoint para ver los precios de la ruta seleccionada por su ID
    @GetMapping("/Aeropuertos/{id}/Rutas/{id_ru}/Precios")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<PrecioxRutaxCabina> PrecioPorRuta(@PathVariable long id_ru) {
        PrecioxRutaxCabina[] precios =  restTemplate.getForObject("http://localhost:8080/Aeropuerto/{id}/Rutas/{id_ru}/Precio/",PrecioxRutaxCabina[].class, id_ru);
        List<PrecioxRutaxCabina> list = new ArrayList<>(Arrays.asList(precios));
        return list;
    }


}
