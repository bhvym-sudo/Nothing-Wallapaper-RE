.class abstract LE8/p;
.super LE8/o;
.source "SourceFile"


# direct methods
.method public static m(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .registers 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    return-object p0
.end method
