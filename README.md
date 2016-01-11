# FameActionBar
It is library simulates a similar ActionBar of android in your java application a simple way. It also provides the MenuNavigator.

## Usage
Include the file Library jar in your folder libs:
Include the jar file in your library in libls  folder.

## How to use java ActionBar
Make the call as follows to obtain the action bar.
```java
ActionBar actionBar = new ActionBar(this);
actionBar.show();
```
![GitHub Logo](https://github.com/rcrepaldi/FameActionBar/blob/master/files-readme/actionbar.png "actionbar")

To use the same properties menu and click events
```java
ActionBar actionBar = new ActionBar(this);
actionBar.setTheme(ActionBar.DARK);
actionBar.setBackgroundColor(Color.decode("#c1c1c1"));
actionBar.setIconMore("../image.png");
actionBar.setHeight(100);
actionBar.setTitle("write new tittle");
actionBar.show();
```
![GitHub Logo](https://github.com/rcrepaldi/FameActionBar/blob/master/files-readme/full-navigation.png "menu navigation open")

### Additional information
You will be able to use all the properties of java swing elements for customization

## License

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
