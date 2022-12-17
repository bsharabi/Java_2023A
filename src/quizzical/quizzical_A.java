package quizzical;

public class quizzical_A {
    public static String defangIPaddr(String address) {
        String ans = "";
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                ans += "[" + address.charAt(i) + "]";
                continue;
            }
            ans += address.charAt(i);
        }
        return ans;
    }

    public static int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for (int i = 0; i < operations.length; i++) {
            String operation = operations[i];
            switch (operation) {
                case "X++":
                    X++;
                    break;
                case "++X":
                    ++X;
                    break;
                case "X--":
                    X--;
                    break;
                case "--X":
                    --X;
                    break;
            }
        }
        return X;
    }

    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;

                }
            }
        }
        return count;
    }

    public static int maximumWealth(int[][] accounts) {
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (sum > maxSum)
                maxSum = sum;
            sum = 0;
        }
        return maxSum;
    }

    static class Book{

        private String name;
        private String author;
        private int pages;

        public Book(String name, String author, int pages) {
            this.name = name;
            this.author = author;
            this.pages = pages;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public int getPages() {
            return pages;
        }

        public void setPages(int pages) {
            this.pages = pages;
        }

        public boolean isSameBook(Book b){

            return (b.name.equals(name)&& b.author.equals(author));
        }
    }
}
