.class public final synthetic LA6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field public final synthetic q:LK1/a;


# direct methods
.method public synthetic constructor <init>(LK1/a;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA6/a;->q:LK1/a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, LA6/a;->q:LK1/a;

    invoke-static {p0}, LA6/b;->a(LK1/a;)Lh3/a0;

    move-result-object p0

    return-object p0
.end method
