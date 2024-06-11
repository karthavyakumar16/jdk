package swiggyapp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Swiggy {



        private List<Restaurant> restaurants;

        public Swiggy() {
            this.restaurants = new ArrayList<>();
        }

        public void addRestaurant(Restaurant restaurant) {
            restaurants.add(restaurant);
        }

        public boolean hasRestaurant(String restaurantName) {
            for (Restaurant restaurant : restaurants) {
                if (restaurant.getName().equalsIgnoreCase(restaurantName)) {
                    return true;
                }
            }
            return false;
        }
        Function<String,Boolean> function1=(restaurantName)->{
            for (Restaurant restaurant : restaurants) {
                if (restaurant.getName().equalsIgnoreCase(restaurantName)) {
                    return true;
                }
            }
            return false;
        };

        public Restaurant getRestaurant(String restaurantName) {
            for (Restaurant restaurant : restaurants) {
                if (restaurant.getName().equalsIgnoreCase(restaurantName)) {
                    return restaurant;
                }
            }
            return null;
//            Function<String,Restaurant> function2=(restaurantName)->{
//                for (Restaurant restaurant : restaurants) {
//                    if (restaurant.getName().equalsIgnoreCase(restaurantName)) {
//                        return restaurant;
//                    }
//                }
//                return null;
          //  };
        }
   }

