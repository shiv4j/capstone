/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.capstone.components.trending__002d__article;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class trending__002d__article__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_trendingartical = null;
Collection var_collectionvar1_list_coerced$ = null;
_global_trendingartical = renderContext.call("use", com.alchemy.capstone.core.models.TrendingModel.class.getName(), obj());
out.write("\n<div class=\"container-fluid pt-3\">\n    <div class=\"container animate-box\" data-animate-effect=\"fadeIn\">\n        <div>\n            <div class=\"fh5co_heading fh5co_heading_border_bottom py-2 mb-4\">");
{
    Object var_0 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_trendingartical, "trendingText"), "text");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</div>\n        </div>\n        ");
{
    Object var_collectionvar1 = renderContext.getObjectModel().resolveProperty(_global_trendingartical, "bannerList");
    {
        long var_size2 = ((var_collectionvar1_list_coerced$ == null ? (var_collectionvar1_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar1)) : var_collectionvar1_list_coerced$).size());
        {
            boolean var_notempty3 = (var_size2 > 0);
            if (var_notempty3) {
                {
                    long var_end6 = var_size2;
                    {
                        boolean var_validstartstepend7 = (((0 < var_size2) && true) && (var_end6 > 0));
                        if (var_validstartstepend7) {
                            out.write("<div class=\"owl-carousel owl-theme js\" id=\"slider1\">");
                            if (var_collectionvar1_list_coerced$ == null) {
                                var_collectionvar1_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar1);
                            }
                            long var_index8 = 0;
                            for (Object banner : var_collectionvar1_list_coerced$) {
                                {
                                    boolean var_traversal10 = (((var_index8 >= 0) && (var_index8 <= var_end6)) && true);
                                    if (var_traversal10) {
                                        out.write("\n            <div class=\"item px-2\">\n                <div class=\"fh5co_latest_trading_img_position_relative\">\n                    <div class=\"fh5co_latest_trading_img\"><img");
                                        {
                                            Object var_attrvalue11 = renderContext.getObjectModel().resolveProperty(banner, "bannerImage");
                                            {
                                                Object var_attrcontent12 = renderContext.call("xss", var_attrvalue11, "uri");
                                                {
                                                    boolean var_shoulddisplayattr14 = (((null != var_attrcontent12) && (!"".equals(var_attrcontent12))) && ((!"".equals(var_attrvalue11)) && (!((Object)false).equals(var_attrvalue11))));
                                                    if (var_shoulddisplayattr14) {
                                                        out.write(" src");
                                                        {
                                                            boolean var_istrueattr13 = (var_attrvalue11.equals(true));
                                                            if (!var_istrueattr13) {
                                                                out.write("=\"");
                                                                out.write(renderContext.getObjectModel().toString(var_attrcontent12));
                                                                out.write("\"");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        out.write(" alt=\"\" class=\"fh5co_img_special_relative\"/></div>\n                    <div class=\"fh5co_latest_trading_img_position_absolute\"></div>\n                    <div class=\"fh5co_latest_trading_img_position_absolute_1\">\n                        <a");
                                        {
                                            String var_attrcontent15 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(banner, "pagePath"), "uri")) + ".html");
                                            out.write(" href=\"");
                                            out.write(renderContext.getObjectModel().toString(var_attrcontent15));
                                            out.write("\"");
                                        }
                                        out.write(" class=\"text-white\">");
                                        {
                                            String var_16 = ((" " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(banner, "bannerText"), "text"))) + " ");
                                            out.write(renderContext.getObjectModel().toString(var_16));
                                        }
                                        out.write("</a>\n                        <div class=\"fh5co_latest_trading_date_and_name_color\">");
                                        {
                                            String var_17 = (" " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(banner, "createDateStr"), "text")));
                                            out.write(renderContext.getObjectModel().toString(var_17));
                                        }
                                        out.write("</div>\n                    </div>\n                </div>\n            </div>\n         ");
                                    }
                                }
                                var_index8++;
                            }
                            out.write("</div>");
                        }
                    }
                }
            }
        }
    }
    var_collectionvar1_list_coerced$ = null;
}
out.write("\n    </div>\n</div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

