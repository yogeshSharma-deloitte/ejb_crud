package com.mycompany.service;

import com.mycompany.DAO.ProductEJB;
import com.mycompany.DAO.UserEJB;
import com.mycompany.Entity.Product;
import com.mycompany.Entity.User;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class UserBean {

    @EJB
    private UserEJB userEJB;

    @EJB
    private ProductEJB productEJB;

    public List<User> getAllUsers() {
        List<User> usersList = userEJB.getAllUsers();
        int count = usersList.size();
        return userEJB.getAllUsers();
    }

    public User saveUser(User user) {
        if(user.getEmail() != "")
            return userEJB.saveUser(user);
        else
            return null;
    }

    public User editUser(Long id, User updatedUser) throws Exception {
        User user = userEJB.getXId(id);
        user.setEmail(updatedUser.getEmail());
        user.setUsername(updatedUser.getUsername());
        user.setId(updatedUser.getId());
        user.setPassword(updatedUser.getPassword());
        return userEJB.editUser(user);
    }

    public void deleteUser(Long id) throws Exception {
        User user = userEJB.getXId(id);
        if(user != null)
            userEJB.deleteUser(user);
    }

    static void findTriplets(int[] arr, int n)
    {
        boolean found = false;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println(arr[i] + " "
                                + arr[j] + " "
                                + arr[k]);
                        found = true;
                    }
                }
            }
        }

        // If no triplet with 0 sum found in array
        if (found == false)
            System.out.println(" not exist ");
    }

    static void findTriplets2(int[] arr, int n)
    {
        boolean found = false;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println(arr[i] + " "
                                + arr[j] + " "
                                + arr[k]);
                        found = true;
                    }
                }
            }
        }

        // If no triplet with 0 sum found in array
        if (found == false)
            System.out.println(" not exist ");
    }

    static void findTriplet3(int[] arr, int n)
    {
        boolean found = false;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println(arr[i] + " "
                                + arr[j] + " "
                                + arr[k]);
                        found = true;
                    }
                }
            }
        }

        // If no triplet with 0 sum found in array
        if (found == false)
            System.out.println(" not exist ");
    }

    static void findTriplets4(int[] arr, int n)
    {
        boolean found = false;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println(arr[i] + " "
                                + arr[j] + " "
                                + arr[k]);
                        found = true;
                    }
                }
            }
        }

        // If no triplet with 0 sum found in array
        if (found == false)
            System.out.println(" not exist ");
    }

    boolean find3Numbers(int A[], int arr_size, int sum)
    {
        int l, r;

        // Fix the first element as A[i]
        for (int i = 0; i < arr_size - 2; i++) {

            // Fix the second element as A[j]
            for (int j = i + 1; j < arr_size - 1; j++) {

                // Now look for the third number
                for (int k = j + 1; k < arr_size; k++) {
                    if (A[i] + A[j] + A[k] == sum) {
                        System.out.print("Triplet is " + A[i] + ", " + A[j] + ", " + A[k]);
                        return true;
                    }
                }
            }
        }

        // If we reach here, then no triplet was found
        return false;
    }

    boolean find3Numbers2(int A[], int arr_size, int sum)
    {
        int l, r;

        // Fix the first element as A[i]
        for (int i = 0; i < arr_size - 2; i++) {

            // Fix the second element as A[j]
            for (int j = i + 1; j < arr_size - 1; j++) {

                // Now look for the third number
                for (int k = j + 1; k < arr_size; k++) {
                    if (A[i] + A[j] + A[k] == sum) {
                        System.out.print("Triplet is " + A[i] + ", " + A[j] + ", " + A[k]);
                        return true;
                    }
                }
            }
        }

        // If we reach here, then no triplet was found
        return false;
    }

    boolean find3Numbers3(int A[], int arr_size, int sum)
    {
        int l, r;

        // Fix the first element as A[i]
        for (int i = 0; i < arr_size - 2; i++) {

            // Fix the second element as A[j]
            for (int j = i + 1; j < arr_size - 1; j++) {

                // Now look for the third number
                for (int k = j + 1; k < arr_size; k++) {
                    if (A[i] + A[j] + A[k] == sum) {
                        System.out.print("Triplet is " + A[i] + ", " + A[j] + ", " + A[k]);
                        return true;
                    }
                }
            }
        }

        // If we reach here, then no triplet was found
        return false;
    }

    // Function to Prints the pair with sum closest to x
    public static void printClosest(int[] arr, int n, int x)
    {
        int res_l = 0,
                res_r = 0; // To store indexes of result pair

        // variable to store current minimum difference
        int temp = Integer.MAX_VALUE;

        // iterating over array
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                // if found more closest pair
                if (Math.abs(arr[i] + arr[j] - x) < temp) {
                    res_l = i;
                    res_r = j;
                    temp = Math.abs(arr[i] + arr[j] - x);
                }
            }
        }

        System.out.println("The closest pair is "
                + arr[res_l] + " and "
                + arr[res_r]);
    }

    // Function to Prints the pair with sum closest to x
    public static void printClosest2(int[] arr, int n, int x)
    {
        int res_l = 0,
                res_r = 0; // To store indexes of result pair

        // variable to store current minimum difference
        int temp = Integer.MAX_VALUE;

        // iterating over array
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                // if found more closest pair
                if (Math.abs(arr[i] + arr[j] - x) < temp) {
                    res_l = i;
                    res_r = j;
                    temp = Math.abs(arr[i] + arr[j] - x);
                }
            }
        }

        System.out.println("The closest pair is "
                + arr[res_l] + " and "
                + arr[res_r]);
    }

    // Function to Prints the pair with sum closest to x
    public static void printClosest3(int[] arr, int n, int x)
    {
        int res_l = 0,
                res_r = 0; // To store indexes of result pair

        // variable to store current minimum difference
        int temp = Integer.MAX_VALUE;

        // iterating over array
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                // if found more closest pair
                if (Math.abs(arr[i] + arr[j] - x) < temp) {
                    res_l = i;
                    res_r = j;
                    temp = Math.abs(arr[i] + arr[j] - x);
                }
            }
        }

        System.out.println("The closest pair is "
                + arr[res_l] + " and "
                + arr[res_r]);
    }

    void printClosest(int ar1[], int ar2[], int m, int n, int x)
    {
        // Initialize the diff between pair sum and x.
        int diff = Integer.MAX_VALUE;

        // res_l and res_r are result indexes from ar1[] and ar2[]
        // respectively
        int res_l = 0, res_r = 0;

        // Start from left side of ar1[] and right side of ar2[]
        int l = 0, r = n-1;
        while (l<m && r>=0)
        {
            // If this pair is closer to x than the previously
            // found closest, then update res_l, res_r and diff
            if (Math.abs(ar1[l] + ar2[r] - x) < diff)
            {
                res_l = l;
                res_r = r;
                diff = Math.abs(ar1[l] + ar2[r] - x);
            }

            // If sum of this pair is more than x, move to smaller
            // side
            if (ar1[l] + ar2[r] > x)
                r--;
            else // move to the greater side
                l++;
        }

        // Print the result
        System.out.print("The closest pair is [" + ar1[res_l] +
                ", " + ar2[res_r] + "]");
    }

    void printClosest2(int ar1[], int ar2[], int m, int n, int x)
    {
        // Initialize the diff between pair sum and x.
        int diff = Integer.MAX_VALUE;

        // res_l and res_r are result indexes from ar1[] and ar2[]
        // respectively
        int res_l = 0, res_r = 0;

        // Start from left side of ar1[] and right side of ar2[]
        int l = 0, r = n-1;
        while (l<m && r>=0)
        {
            // If this pair is closer to x than the previously
            // found closest, then update res_l, res_r and diff
            if (Math.abs(ar1[l] + ar2[r] - x) < diff)
            {
                res_l = l;
                res_r = r;
                diff = Math.abs(ar1[l] + ar2[r] - x);
            }

            // If sum of this pair is more than x, move to smaller
            // side
            if (ar1[l] + ar2[r] > x)
                r--;
            else // move to the greater side
                l++;
        }

        // Print the result
        System.out.print("The closest pair is [" + ar1[res_l] +
                ", " + ar2[res_r] + "]");
    }

    private static int isPairSum(int A[], int N, int X)
    {
        // Nested for loops for iterations
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                // As equal i and j means same element
                if (i == j)

                    // continue keyword skips the execution
                    // for following condition
                    continue;

                // Condition check if pair exists
                if (A[i] + A[j] == X)
                    return 1;

                // By now the array is sorted
                if (A[i] + A[j] > X)

                    // Break keyword to hault the execution
                    break;
            }
        }

        // No pair found with given sum.
        return 0;
    }

    static void fillPrefixSum(int arr[], int n,
                              int prefixSum[])
    {
        prefixSum[0] = arr[0];
        // Adding present element with previous element
        for (int i = 1; i < n; ++i)
            prefixSum[i] = prefixSum[i - 1] + arr[i];
    }

    static int longestSubarrWthSumDivByK(int arr[], int N, int k)
    {
        int maxl = 0;
        for (int i = 0; i < N; i++) {
            int sum1 = 0;
            for (int j = i; j < N; j++) {
                sum1 += arr[j];
                if (sum1 % k == 0)
                    maxl = Math.max(maxl, j - i + 1);
            }
        }

        return maxl;
    }

    public static boolean subArrayExists(int arr[], int n)
    {
        for (int i = 0; i < n; i++) {
            int sum = arr[i];
            if (sum == 0)
                return true;
            for (int j = i + 1; j < n; j++) {
                sum += arr[j];
                if (sum == 0)
                    return true;
            }
        }
        return false;
    }

    public static List<Integer>
    leftRightDifference(List<Integer> arr)
    {
        int n = arr.size();
        List<Integer> res = new ArrayList<>(n);

        // Iterate in array arr[]
        for (int i = 0; i < n; i++) {
            int leftSum = 0, rightSum = 0;

            // calculate left sum
            for (int j = 0; j < i; j++)
                leftSum += arr.get(j);

            // calculate right sum
            for (int j = i + 1; j < n; j++)
                rightSum += arr.get(j);

            // add absolute difference to result list
            res.add(Math.abs(leftSum - rightSum));
        }

        return res;
    }

    int equilibrium(int arr[], int n)
    {
        int i, j;
        int leftsum, rightsum;

		/* Check for indexes one by one until
		an equilibrium index is found */
        for (i = 0; i < n; ++i) {

            /* get left sum */
            leftsum = 0;
            for (j = 0; j < i; j++)
                leftsum += arr[j];

            /* get right sum */
            rightsum = 0;
            for (j = i + 1; j < n; j++)
                rightsum += arr[j];

			/* if leftsum and rightsum are same,
			then we are done */
            if (leftsum == rightsum)
                return i;
        }

        /* return -1 if no equilibrium index is found */
        return -1;
    }

    public Long getProductCount() {
        List<Product> productList = productEJB.getAllProducts();
        Long count = Long.valueOf(productList.size());
        return count;
    }
}
