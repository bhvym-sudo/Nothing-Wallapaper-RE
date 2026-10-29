.class final synthetic LG7/l$a$a;
.super Lkotlin/jvm/internal/a;
.source "SourceFile"

# interfaces
.implements Lv8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG7/l$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final x:LG7/l$a$a;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LG7/l$a$a;

    invoke-direct {v0}, LG7/l$a$a;-><init>()V

    sput-object v0, LG7/l$a$a;->x:LG7/l$a$a;

    return-void
.end method

.method constructor <init>()V
    .registers 7

    const-string v4, "<init>(Ljava/lang/Object;Ljava/lang/Object;)V"

    const/4 v5, 0x4

    const/4 v1, 0x3

    const-class v2, Lh8/o;

    const-string v3, "<init>"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/a;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/String;Lm8/e;)Ljava/lang/Object;
    .registers 4

    invoke-static {p1, p2, p3}, LG7/l$a;->s(Ljava/lang/Object;Ljava/lang/String;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    check-cast p2, Ljava/lang/String;

    check-cast p3, Lm8/e;

    invoke-virtual {p0, p1, p2, p3}, LG7/l$a$a;->a(Ljava/lang/Object;Ljava/lang/String;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
