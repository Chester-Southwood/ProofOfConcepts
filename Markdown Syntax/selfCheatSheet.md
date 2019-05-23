## Sources used when researching markdown.

* [Video Link for Markdown Crash Course](https://www.youtube.com/watch?v=HUBNt18RFbo)

* [Adam Pritchard's Github post of his Cheatsheet](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet)

## Ways to write Markdown I found convienent and easy to use.

* Visual Studio Extension: [auto-open-markdown-previewer](https://marketplace.visualstudio.com/items?itemName=hnw.vscode-auto-open-markdown-preview)

* 3rd party program: [Typora](https://typora.io/)
with extension [Pandoc](https://pandoc.org/installing.html) to export .md to several different types of files. 

# __Different Headings__

# Heading 1
## Heading 2
### Heading 3
#### Heading 4
##### Heading 5
###### Heading 6

# __Paragraph/Normal Text__

<p>Paragraph</p>
Paragraph

# __Italics__
*This text* is intalic

_This text_ is also italic

# __Strikethough__
~~This text~~ is strikethrough

# __Line Breaks__
---
___

# __Escape Characters Exist__

\*This is not italisized, it was stopped.

# __Block Quotes__

> This is a quote

# __Hyperlinks__

https://www.chestersouthwood.net

[Chester Southwood](https://www.chestersouthwood.net)

<!-- Link with title hover -->
[Chester Southwood](https://www.chestersouthwood.net "Chester Southwood's highly needed updated website")

# __Lists__

## __Unordered List__
* Item 1
* Item 2
* Item 3
    * Sub Item 1
    * Sub Item 2
        * Sub Sub Item 1

## __Ordered List__

1. Item 1
2. Item 2
3. Item 3

<!-- OL Alternative -->
1. Item 4
1. Item 5
1. Item 6

# __Inline Code Block__

<!-- Inline Code Block -->
`<p>Inline code block</p>`

# __Images__

* Even gifs supported on some markdown flavors.

![Text I think Screen Reader Views](tree-diagram.jpeg)"Hover Text of the Image")

# __Github Flavor__

## __Code Blocks__

```bash
 #bash
 direction 1: Wake up
 direction 2: start PC
 direction 3: npm install
 direction 4: npm start
 ```

 ```html
 <!-- HTML -->
 <html>
 <html>
    <title>Demo</title>
 </head>
 <body>
 </body>
 </html>
 ```

 ```javascript
  //Javascript
  function concat(str1, str2){
      return str1 + str2;
  }
  ```

 ```java
  //Java
  public static String concat(String str1, String str2)
  {
      return str1 + str2;
  }
  ```

```pascal
 //Pascal 
 program HelloWorld;
 begin
  writeln ("Hello World!");
 end;
```
   
```brainfuck 
[This is Brainfuck for your own sanity, don't attempt to learn it.]+++++++++++++++++++++++++++++++.
-[--->+<]>-.[---->+++++<]>-.+.++++++++++.+[---->+<]>+++.-[--->++<]>-.++++++++++.+[---->+<]>+++.[-->+++++++<]>.++.-------------.[--->+<]>---..+++++.-[---->+<]>++.+[->+++<]>.++++++++++++..---.[-->+<]>--------.
```

## __Tables__

| Name          | Info |
| ------        | ---- |
| Bob Silverste | nada |
| Chuck Soutwoo | nada | 

## __Task List__

* [ ] Task 1
* [x] Task 2
* [x] Task 3