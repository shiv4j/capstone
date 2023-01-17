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
package org.apache.sling.scripting.sightly.apps.capstone.components.home__002d__banner;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class home__002d__banner__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_homebanner = null;
Collection var_collectionvar0_list_coerced$ = null;
Collection var_collectionvar17_list_coerced$ = null;
_global_homebanner = renderContext.call("use", com.alchemy.capstone.core.models.HomeBannerModel.class.getName(), obj());
out.write("\n<div class=\"container-fluid paddding mb-5\">\n    <div class=\"row mx-0\">\n        ");
{
    Object var_collectionvar0 = renderContext.getObjectModel().resolveProperty(_global_homebanner, "bannerList");
    {
        long var_size1 = ((var_collectionvar0_list_coerced$ == null ? (var_collectionvar0_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar0)) : var_collectionvar0_list_coerced$).size());
        {
            boolean var_notempty2 = (var_size1 > 0);
            if (var_notempty2) {
                {
                    long var_end5 = var_size1;
                    {
                        boolean var_validstartstepend6 = (((0 < var_size1) && true) && (var_end5 > 0));
                        if (var_validstartstepend6) {
                            out.write("<div class=\"col-md-6 col-12 paddding animate-box\" data-animate-effect=\"fadeIn\">");
                            if (var_collectionvar0_list_coerced$ == null) {
                                var_collectionvar0_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar0);
                            }
                            long var_index7 = 0;
                            for (Object banneritem : var_collectionvar0_list_coerced$) {
                                {
                                    boolean banneritemlist_field$_first = (var_index7 == 0);
                                    {
                                        boolean var_traversal9 = (((var_index7 >= 0) && (var_index7 <= var_end5)) && true);
                                        if (var_traversal9) {
                                            out.write("\n            ");
                                            {
                                                boolean var_testvariable10 = banneritemlist_field$_first;
                                                if (var_testvariable10) {
                                                    out.write("<div class=\"fh5co_suceefh5co_height\">\n\t\t\t<img");
                                                    {
                                                        Object var_attrvalue11 = renderContext.getObjectModel().resolveProperty(banneritem, "bannerImage");
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
                                                    out.write(" alt=\"img\"/>\n                <div class=\"fh5co_suceefh5co_height_position_absolute\"></div>\n                <div class=\"fh5co_suceefh5co_height_position_absolute_font\">\n                    <div class=\"\"><a href=\"#\" class=\"color_fff\"> <i class=\"fa fa-clock-o\"></i>");
                                                    {
                                                        String var_15 = (("&nbsp;&nbsp;" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(banneritem, "createdDatestr"), "text"))) + "\n                    ");
                                                        out.write(renderContext.getObjectModel().toString(var_15));
                                                    }
                                                    out.write("</a></div>\n                    <div class=\"\"><a href=\"single.html\" class=\"fh5co_good_font\">");
                                                    {
                                                        String var_16 = ((" " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(banneritem, "bannerText"), "text"))) + " ");
                                                        out.write(renderContext.getObjectModel().toString(var_16));
                                                    }
                                                    out.write("</a></div>\n                </div>\n            </div>");
                                                }
                                            }
                                            out.write("\n        ");
                                        }
                                    }
                                }
                                var_index7++;
                            }
                            out.write("</div>");
                        }
                    }
                }
            }
        }
    }
    var_collectionvar0_list_coerced$ = null;
}
out.write("\n        <div class=\"col-md-6\">\n            ");
{
    Object var_collectionvar17 = renderContext.getObjectModel().resolveProperty(_global_homebanner, "bannerList");
    {
        long var_size18 = ((var_collectionvar17_list_coerced$ == null ? (var_collectionvar17_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar17)) : var_collectionvar17_list_coerced$).size());
        {
            boolean var_notempty19 = (var_size18 > 0);
            if (var_notempty19) {
                {
                    long var_end22 = var_size18;
                    {
                        boolean var_validstartstepend23 = (((0 < var_size18) && true) && (var_end22 > 0));
                        if (var_validstartstepend23) {
                            out.write("<div class=\"row\">");
                            if (var_collectionvar17_list_coerced$ == null) {
                                var_collectionvar17_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar17);
                            }
                            long var_index24 = 0;
                            for (Object banneritem : var_collectionvar17_list_coerced$) {
                                {
                                    boolean banneritemlist_field$_first = (var_index24 == 0);
                                    {
                                        boolean var_traversal26 = (((var_index24 >= 0) && (var_index24 <= var_end22)) && true);
                                        if (var_traversal26) {
                                            out.write("\n                ");
                                            {
                                                boolean var_testvariable27 = (!banneritemlist_field$_first);
                                                if (var_testvariable27) {
                                                    out.write("<div class=\"col-md-6 col-6 paddding animate-box\" data-animate-effect=\"fadeIn\">\n                    <div class=\"fh5co_suceefh5co_height_2\"><img src=\"images/science-578x362.jpg\" alt=\"img\"/>\n                        <div class=\"fh5co_suceefh5co_height_position_absolute\"></div>\n                        <div class=\"fh5co_suceefh5co_height_position_absolute_font_2\">\n                            <div class=\"\"><a href=\"#\" class=\"color_fff\"> <i class=\"fa fa-clock-o\"></i>");
                                                    {
                                                        String var_28 = (("&nbsp;&nbsp;" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(banneritem, "createdDatestr"), "text"))) + "\n                              ");
                                                        out.write(renderContext.getObjectModel().toString(var_28));
                                                    }
                                                    out.write("</a></div>\n                            <div class=\"\"><a href=\"single.html\" class=\"fh5co_good_font_2\">");
                                                    {
                                                        String var_29 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(banneritem, "bannerText"), "text")) + "  ");
                                                        out.write(renderContext.getObjectModel().toString(var_29));
                                                    }
                                                    out.write("</a></div>\n                        </div>\n                    </div>\n                </div>");
                                                }
                                            }
                                            out.write("\n             ");
                                        }
                                    }
                                }
                                var_index24++;
                            }
                            out.write("</div>");
                        }
                    }
                }
            }
        }
    }
    var_collectionvar17_list_coerced$ = null;
}
out.write("\n        </div>\n    </div>\n</div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

