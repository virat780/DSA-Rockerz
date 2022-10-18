class Solution {
public:
    vector<vector<int>> levelOrder(TreeNode* root) {
       vector<vector<int>> ans;
        if(!root) return ans;
        TreeNode *curr = root;
        queue<TreeNode*> q;
        q.push(root);
        q.push(NULL);
        while(!q.empty()){
            vector<int> temp;
            TreeNode *curr;
            while(q.front() != NULL){
                curr = q.front();
                temp.emplace_back(curr->val);
                q.pop();
                if(curr->left) q.push(curr->left);
                if(curr->right) q.push(curr->right);
            }
            ans.emplace_back(temp);
            q.pop();
            q.push(NULL);
            if(q.front() == NULL) break;
        }
        return ans;
    }
};
