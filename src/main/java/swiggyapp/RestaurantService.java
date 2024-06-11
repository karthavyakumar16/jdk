package swiggyapp;

import java.util.function.BiFunction;

public class RestaurantService {

        public static Restaurant findRestaurant(Swiggy swiggy, String restaurantName) {
            return swiggy.getRestaurant(restaurantName);
        }

        BiFunction<Swiggy,String,Restaurant> bifunction=(swiggy,restaurantName)->{
            return swiggy.getRestaurant(restaurantName);
        };
    }

