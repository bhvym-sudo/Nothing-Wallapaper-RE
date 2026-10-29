.class public final synthetic LF8/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/q;


# instance fields
.field public final synthetic q:Lv8/l;


# direct methods
.method public synthetic constructor <init>(Lv8/l;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF8/m;->q:Lv8/l;

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    iget-object p0, p0, LF8/m;->q:Lv8/l;

    check-cast p1, Ljava/lang/Throwable;

    check-cast p3, Lm8/i;

    invoke-static {p0, p1, p2, p3}, LF8/n;->j(Lv8/l;Ljava/lang/Throwable;Ljava/lang/Object;Lm8/i;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
