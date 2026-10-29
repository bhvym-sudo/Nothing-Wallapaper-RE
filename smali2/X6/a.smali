.class public abstract LX6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lcom/nothing/wallpaper/picker/creative/model/PromptCategory;)Z
    .registers 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/creative/model/PromptCategory;->getCategory()Ljava/lang/String;

    move-result-object p0

    const-string v0, "Style"

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    return p0
.end method

.method public static final b(Lcom/nothing/wallpaper/picker/creative/model/PromptCategory;)Z
    .registers 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/creative/model/PromptCategory;->getCategory()Ljava/lang/String;

    move-result-object p0

    const-string v0, "Subject"

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    return p0
.end method
