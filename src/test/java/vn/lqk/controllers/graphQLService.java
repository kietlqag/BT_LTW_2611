package vn.lqk.controllers;

import graphql.GraphQL;
import org.springframework.stereotype.Service;

@Service
public class graphQLService {

    private static GraphQL graphQL = null;

    public graphQLService(GraphQL graphQL) {
        graphQLService.graphQL = graphQL;
    }

    public static Object execute(String query) {
        return graphQL.execute(query).getData();
    }
}
