.class public final synthetic LQ8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP8/r$c;


# instance fields
.field public final synthetic a:LP8/r;


# direct methods
.method public synthetic constructor <init>(LP8/r;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ8/b;->a:LP8/r;

    return-void
.end method


# virtual methods
.method public final a(LP8/e;)LP8/r;
    .registers 2

    iget-object p0, p0, LQ8/b;->a:LP8/r;

    invoke-static {p0, p1}, LQ8/d;->a(LP8/r;LP8/e;)LP8/r;

    move-result-object p0

    return-object p0
.end method
