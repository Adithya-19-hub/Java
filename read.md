After executing the git merge command, basically git decides one of these two steps.
  1:Fast-forward-merge
  2:Three-way merge.(littlebit difficult)

What happens in the fast-forward merge?
1:Git moves main branch forward to match with the feature branch changes

when it is considered?
A:When no new commits touches the main branch since feature branch is created.

Does new merge is created?
A:No, any new merge commit is not created.

How the commit history looks?
A:The commit history looks straight and no any unbroken line.


-->if the local code is commited, and if the main branch touches the local code then, git chooses three-way merge.
what happens in the 3-way merge? after merging the feature branch into main.
1:Git compares 3 commits(main branch commit,feature branch commit,common ancestor).
2:Git combines the changes from feature branch, main branch.
3:Git then creates a new merge commit.
4:Now main branch moves to point to the newly created merge commit.
5:where the merge commit is created?
  -->The new brand merge commit is created on the target branch.
