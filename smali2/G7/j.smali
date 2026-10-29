.class public final synthetic LG7/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/l;


# instance fields
.field public final synthetic q:LJ7/i;


# direct methods
.method public synthetic constructor <init>(LJ7/i;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG7/j;->q:LJ7/i;

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    iget-object p0, p0, LG7/j;->q:LJ7/i;

    check-cast p1, LA7/a;

    invoke-static {p0, p1}, LG7/l;->b(LJ7/i;LA7/a;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
