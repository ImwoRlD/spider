package com.imworld.spider.myspider;

import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

public class AutoSpider extends Spider{
    /**
     * create a spider with pageProcessor.
     *
     * @param pageProcessor pageProcessor
     */
    public AutoSpider(PageProcessor pageProcessor) {
        super(pageProcessor);
    }
}
