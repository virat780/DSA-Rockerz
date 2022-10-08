/*
    Solution : 
    Time complexity : O(N)
    Space Complexity : O(1)

    1. Simply iterate over the array and match match each element to given value
    2. If value is find return its index (i) else -1
*/

class Solution {
public:
    int linearSearch(vector<int> v, int val)
    {
        for (int i = 0; i < v.size(); i++)
        {
            if (v[i] == val)
            {
                return i;
            }
        }
        return -1;
    }
};
