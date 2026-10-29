.class public abstract Lo8/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a([Ljava/lang/Enum;)Lo8/a;
    .registers 2

    const-string v0, "entries"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lo8/c;

    invoke-direct {v0, p0}, Lo8/c;-><init>([Ljava/lang/Enum;)V

    return-object v0
.end method
