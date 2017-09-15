package zhihui.xu.base.architecture;

import zhihui.xu.base.architecture.service.SysUserService;

/**
 * Created by zhihui.xu on 2017/9/15.
 */
public class Main {
    public static void main(String[] args) {
        SysUserService sysUserService = new SysUserService() {
            @Override
            public boolean isExist(String userName) {
                return false;
            }
        };
    }
}
