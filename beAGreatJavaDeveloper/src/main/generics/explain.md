# explain "GoodExample.java" and "BadExample.java"

It will occur ClassCastException on line 11 in main method in BadExample.java.
"list" variable is expected to has String type value on line 11 but actually has int type value
because "list" variable can have various types value.

To solve this issue, I made GoodExample.java.
"list" variable specify type of value on line 8
so "list" variable can't have various types value.