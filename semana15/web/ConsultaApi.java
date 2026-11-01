package wemana15.web;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaApi {
    public static void main(String[] args) {
        HttpClient cliente = HttpClient.newHttpClient();[cite: 138]
        HttpRequest peticion = HttpRequest.newBuilder()[cite: 138]
                .uri(URI.create("https://jsonplaceholder.typicode.com/todos/1"))
                .GET()
                .build();
        try {
            HttpResponse<String> respuesta =[cite: 138]
                    cliente.send(peticion, HttpResponse.BodyHandlers.ofString());
            System.out.println("Codigo: " + respuesta.statusCode());[cite: 138]
            System.out.println(respuesta.body());[cite: 138]
        } catch (IOException e) {
            System.out.println("Fallo de red: " + e.getClass().getSimpleName());[cite: 138]
        } catch (InterruptedException e) {
            System.out.println("Peticion interrumpida");[cite: 138]
        }
    }
}