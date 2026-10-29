.class public final synthetic LU5/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/l;


# instance fields
.field public final synthetic q:LU5/e;


# direct methods
.method public synthetic constructor <init>(LU5/e;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU5/c;->q:LU5/e;

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    iget-object p0, p0, LU5/c;->q:LU5/e;

    check-cast p1, LF5/m;

    invoke-static {p0, p1}, LU5/e;->A(LU5/e;LF5/m;)Lcom/nothing/launcher/card/j;

    move-result-object p0

    return-object p0
.end method
