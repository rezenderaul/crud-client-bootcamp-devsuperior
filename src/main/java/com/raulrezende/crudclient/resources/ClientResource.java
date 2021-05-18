package com.raulrezende.crudclient.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raulrezende.crudclient.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "José", "111111111", 3000.0, 2, Instant.parse("1984-11-05T13:15:30Z")));
		list.add(new Client(2L, "João", "222222222", 5000.0, 3, Instant.parse("1990-07-15T03:21:10Z")));
		list.add(new Client(3L, "Jair", "333333333", 7000.0, 0, Instant.parse("1987-01-30T00:18:45Z")));
		return ResponseEntity.ok().body(list);
	}
}
