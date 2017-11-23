#use File

def User(){

};

def User.current() = User();
def User.home() = File(java("java.lang.System").getProperty("user.home"));
def User.name() = java("java.lang.System").getProperty("user.name");