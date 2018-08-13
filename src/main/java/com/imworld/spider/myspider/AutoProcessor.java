package com.imworld.spider.myspider;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

public class AutoProcessor implements PageProcessor {
    private Site site;
    @Override
    public void process(Page page) {

    }

    @Override
    public Site getSite() {
        return this.site;
    }
}
