.class public final synthetic LE7/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# instance fields
.field public final synthetic q:LE7/e;


# direct methods
.method public synthetic constructor <init>(LE7/e;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE7/d;->q:LE7/e;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iget-object p0, p0, LE7/d;->q:LE7/e;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, LF7/f;

    invoke-static {p0, p1, p2}, LE7/e;->a(LE7/e;ZLF7/f;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
