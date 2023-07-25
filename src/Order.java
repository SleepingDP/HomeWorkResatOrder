
    public class Order {
        private OrderItem meal;
        private OrderItem drink;
        private boolean hasIceCubes;

        private boolean hasLemon;
        public Order(OrderItem meal, OrderItem drink, boolean hasIceCubes, boolean hasLemon) {
            this.meal = meal;
            this.drink = drink;
            this.hasIceCubes = hasIceCubes;
            this.hasLemon = hasLemon;

        }
        public OrderItem getMeal() {
            return meal;
        }
        public void setMeal(OrderItem meal) {
            this.meal = meal;
        }

        public OrderItem getDrink() {
            return drink;
        }

        public void setDrink(OrderItem drink) {
            this.drink = drink;
        }

        public boolean isHasIceCubes() {
            return hasIceCubes;
        }

        public void setHasIceCubes(boolean hasIceCubes) {
            this.hasIceCubes = hasIceCubes;
        }

        public boolean isHasLemon() {
            return hasLemon;
        }

        public void setHasLemon(boolean hasLemon) {
            this.hasLemon = hasLemon;
        }
        public double getTotalPrice() {
            double mealPrice = meal != null ? meal.getPrice() : 0;
            double drinkPrice = drink != null ? drink.getPrice() : 0;
            return mealPrice + drinkPrice;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Заказ: \n");
            if (meal != null) {
                sb.append("Обед: ").append(meal).append("\n");
            }
            if (drink != null) {
                sb.append("Напиток: ").append(drink).append("\n");
            }
            sb.append("Добавить лед: ").append(hasIceCubes).append("\n");
            sb.append("Добавить лимон: ").append(hasLemon).append("\n");
            sb.append("Общая стоимость: ").append(getTotalPrice()).append(" евро.").append("\n");
            return sb.toString();
        }
    }
