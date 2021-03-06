package org.lxg.basic.patterns.bridge.bridge;

/**
 * 描述：牛排大类-羊扒小类
 *
 * @author coder-pig： 2017/02/05 下午2:11
 */
class LambSteak extends AbstractSteak {

    LambSteak(AbstractRations rations) { super(rations); }

    @Override public String sale() { return "羊扒"+ (rations == null ? "" : rations.rations()); }
}
