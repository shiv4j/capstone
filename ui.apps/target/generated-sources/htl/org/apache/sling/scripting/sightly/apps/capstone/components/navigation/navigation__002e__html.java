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
package org.apache.sling.scripting.sightly.apps.capstone.components.navigation;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class navigation__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_navigation = null;
Collection var_collectionvar0_list_coerced$ = null;
Collection var_collectionvar18_list_coerced$ = null;
_global_navigation = renderContext.call("use", com.adobe.cq.wcm.core.components.models.Navigation.class.getName(), obj());
out.write("\n<div class=\"container-fluid bg-faded fh5co_padd_mediya padding_786\">\n    <div class=\"container padding_786\">\n        <nav class=\"navbar navbar-toggleable-md navbar-light \">\n            <button class=\"navbar-toggler navbar-toggler-right mt-3\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"><span class=\"fa fa-bars\"></span></button>\n            <a class=\"navbar-brand\" href=\"https://technext.github.io/24-news/blog.html#\"><img src=\"./24 News \u2014 Free Website Template, Free HTML5 Template by FreeHTML5.co_files/logo.png\" alt=\"img\" class=\"mobile_logo_width\"/></a>\n            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n                ");
{
    Object var_collectionvar0 = renderContext.getObjectModel().resolveProperty(_global_navigation, "items");
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
                            out.write("<ul class=\"navbar-nav mr-auto\">");
                            if (var_collectionvar0_list_coerced$ == null) {
                                var_collectionvar0_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar0);
                            }
                            long var_index7 = 0;
                            for (Object nav : var_collectionvar0_list_coerced$) {
                                {
                                    boolean var_traversal9 = (((var_index7 >= 0) && (var_index7 <= var_end5)) && true);
                                    if (var_traversal9) {
                                        out.write("\n                    ");
                                        {
                                            boolean var_testvariable10 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(nav, "children"), "size"), 0));
                                            if (var_testvariable10) {
                                                out.write("<li");
                                                {
                                                    String var_attrcontent11 = ("nav-item " + renderContext.getObjectModel().toString(renderContext.call("xss", (renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(nav, "isCurrent")) ? "active" : ""), "attribute")));
                                                    out.write(" class=\"");
                                                    out.write(renderContext.getObjectModel().toString(var_attrcontent11));
                                                    out.write("\"");
                                                }
                                                out.write(">\n                        <a class=\"nav-link\"");
                                                {
                                                    String var_attrcontent12 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(nav, "page"), "path"), "uri")) + ".html");
                                                    out.write(" href=\"");
                                                    out.write(renderContext.getObjectModel().toString(var_attrcontent12));
                                                    out.write("\"");
                                                }
                                                out.write(">");
                                                {
                                                    Object var_13 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(nav, "page"), "title"), "text");
                                                    out.write(renderContext.getObjectModel().toString(var_13));
                                                }
                                                {
                                                    Object var_testvariable14 = renderContext.getObjectModel().resolveProperty(nav, "isCurrent");
                                                    if (renderContext.getObjectModel().toBoolean(var_testvariable14)) {
                                                        out.write("<span class=\"sr-only\">(current)</span>");
                                                    }
                                                }
                                                out.write("</a>\n                    </li>");
                                            }
                                        }
                                        out.write("\n                    ");
                                        {
                                            boolean var_testvariable15 = (!(org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.leq(renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(nav, "children"), "size"), 0)));
                                            if (var_testvariable15) {
                                                out.write("<li class=\"nav-item dropdown\">\n                        <a class=\"nav-link dropdown-toggle\"");
                                                {
                                                    String var_attrcontent16 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(nav, "page"), "path"), "uri")) + ".html");
                                                    out.write(" href=\"");
                                                    out.write(renderContext.getObjectModel().toString(var_attrcontent16));
                                                    out.write("\"");
                                                }
                                                out.write(" id=\"dropdownMenuButton2\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">");
                                                {
                                                    Object var_17 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(nav, "page"), "title"), "text");
                                                    out.write(renderContext.getObjectModel().toString(var_17));
                                                }
                                                out.write("<span class=\"sr-only\">(current)</span></a>\n                         ");
                                                {
                                                    Object var_collectionvar18 = renderContext.getObjectModel().resolveProperty(nav, "children");
                                                    {
                                                        long var_size19 = ((var_collectionvar18_list_coerced$ == null ? (var_collectionvar18_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar18)) : var_collectionvar18_list_coerced$).size());
                                                        {
                                                            boolean var_notempty20 = (var_size19 > 0);
                                                            if (var_notempty20) {
                                                                {
                                                                    long var_end23 = var_size19;
                                                                    {
                                                                        boolean var_validstartstepend24 = (((0 < var_size19) && true) && (var_end23 > 0));
                                                                        if (var_validstartstepend24) {
                                                                            out.write("<div class=\"dropdown-menu\">");
                                                                            if (var_collectionvar18_list_coerced$ == null) {
                                                                                var_collectionvar18_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar18);
                                                                            }
                                                                            long var_index25 = 0;
                                                                            for (Object childnav : var_collectionvar18_list_coerced$) {
                                                                                {
                                                                                    boolean var_traversal27 = (((var_index25 >= 0) && (var_index25 <= var_end23)) && true);
                                                                                    if (var_traversal27) {
                                                                                        out.write("\n                                    <a");
                                                                                        {
                                                                                            String var_attrcontent28 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(childnav, "page"), "path"), "uri")) + ".html");
                                                                                            out.write(" href=\"");
                                                                                            out.write(renderContext.getObjectModel().toString(var_attrcontent28));
                                                                                            out.write("\"");
                                                                                        }
                                                                                        out.write(" class=\"dropdown-item\">");
                                                                                        {
                                                                                            Object var_29 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(childnav, "page"), "title"), "text");
                                                                                            out.write(renderContext.getObjectModel().toString(var_29));
                                                                                        }
                                                                                        out.write("</a>\n     \t\t\t\t\t ");
                                                                                    }
                                                                                }
                                                                                var_index25++;
                                                                            }
                                                                            out.write("</div>");
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    var_collectionvar18_list_coerced$ = null;
                                                }
                                                out.write("                  \t   \n                    </li>");
                                            }
                                        }
                                        out.write("                 \n                ");
                                    }
                                }
                                var_index7++;
                            }
                            out.write("</ul>");
                        }
                    }
                }
            }
        }
    }
    var_collectionvar0_list_coerced$ = null;
}
out.write("\n            </div>\n        </nav>\n    </div>\n</div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

