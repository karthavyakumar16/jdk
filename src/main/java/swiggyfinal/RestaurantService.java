package swiggyfinal;

import java.util.function.Supplier;

public class RestaurantService {

    Supplier<Restaurant> findRestaurant(Swiggy swiggy, String name) {
        return () -> {
            for (Restaurant restaurant1 : swiggy.getRestaurants()) {
                if (restaurant1.getName().equalsIgnoreCase(name)) {
                    return restaurant1;
                }
            }
            return null;

        };
    }
}

