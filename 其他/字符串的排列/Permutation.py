# -*- coding:utf-8 -*-
#输入一个字符串,按字典序打印出该字符串中字符的所有排列。
#例如输入字符串abc,则打印出由字符a,b,c
#所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。


import itertools
class Solution:
    def Permutation(self, ss):
        # write code here
        if(ss==''):
            return []
        li=list(itertools.permutations(list(ss),len(ss)))
    	for i in range(len(li)):
        	li[i]=''.join(li[i])
    	l=list(set(li))
        return (sorted(l))
            
        