public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] result = solution.findRestaurant(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"}, new String[]{"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"});
        System.out.println(result[0]);
    }
}
