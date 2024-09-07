package org.ironhack.classes;

import com.google.gson.Gson;
import org.ironhack.exercise.Product;
import org.apache.commons.lang3.StringUtils;

public class App {
    public static void main(String[] args) {
        Gson gson = new Gson();

        String json = "{\"name\":\"laptop\",\"price\":999.99}";

        Product product = gson.fromJson(json, Product.class);
        System.out.println("Original product: " + product.toString());

        // capitalizar el nombre usando Apache Commons Lang
        product.setName(StringUtils.capitalize(product.getName()));
        product.setPrice(899.99); // Cambiar el precio

        String updatedJson = gson.toJson(product);
        System.out.println("Modified product to JSON: " + updatedJson);

    }
}
