package vn.lqk.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class RunController {

	@PostMapping("/graphql")
    public ResponseEntity<Object> executeGraphQL(@RequestBody String query) {
        // Xử lý truy vấn GraphQL tại đây
        return ResponseEntity.ok().body(graphQLService.execute(query));
    }
}
