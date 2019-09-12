# MockLoading
lib

# How to
To get a Git project into your build:

# Step 1. Add the JitPack repository to your build file

gradle
maven
sbt
leiningen
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
# Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.gaoguanqi:MockLoading:1.0.0'
	}
Share this release:

# 使用方法：

```
   private Loading58Dialog mLoadingDialog;
   
    private void showLoading() {
        if(mLoadingDialog == null){
            mLoadingDialog = new Loading58Dialog(this);
        }
        if(!mLoadingDialog.isShowing()){
            mLoadingDialog.show();
        }
    }

    private void hideLoading() {
        if(mLoadingDialog != null && mLoadingDialog.isShowing()){
            mLoadingDialog.dismiss();
        }
    }  
```		

  

