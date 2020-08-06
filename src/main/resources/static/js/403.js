function jumpurl(){
    location='/';
}
function f(){
            vm.timecount--;
        }
if(!window.data){
    window.data={
        timecount:10,
    }
}else{
    window.data['timecount']=10
}

if(!window.computed){
    window["computer"]={
        u(){
            if(this.timecount==0){
                jumpurl();
            }
        }
    }
}else{
    window.computer['u']=function u(){
        if(this.timecount==0){
            jumpurl();
        }
    }
}
function mounted() {
    setInterval('f()', 1000);
    this.getCurrentUserName();
}